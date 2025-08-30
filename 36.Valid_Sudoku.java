public boolean isValidSudoku(char[][] b) {
    // 9 sets for rows, cols, and boxes
    HashSet<Character>[] row = new HashSet[9], col = new HashSet[9], box = new HashSet[9];
    for (int i = 0; i < 9; i++) { 
        row[i] = new HashSet<>(); 
        col[i] = new HashSet<>(); 
        box[i] = new HashSet<>(); 
    }

    // check every cell
    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            char v = b[r][c]; 
            if (v == '.') continue; // skip empty cells

            int idx = (r/3) * 3 + c/3; // find 3x3 box index

            // if number already seen in row, col, or box → not valid
            if (row[r].contains(v) || col[c].contains(v) || box[idx].contains(v)) 
                return false;

            // store number in row, col, and box
            row[r].add(v); 
            col[c].add(v); 
            box[idx].add(v);
        }
    }
    return true; // valid board
}
