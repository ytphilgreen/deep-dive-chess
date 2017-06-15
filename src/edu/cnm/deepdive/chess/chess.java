package edu.cnm.deepdive.chess;

public class chess {
  public static final char WHITE_KING = '\u2654';
  public static final char WHITE_QUEEN = '\u2655';
  public static final char WHITE_ROOK = '\u2656';
  public static final char WHITE_BISHOP = '\u2657';
  public static final char WHITE_KNIGHT ='\u2658';
  public static final char WHITE_PAWN = '\u2659';
  
  public static final char BLACK_KING = '\u265a';
  public static final char BLACK_QUEEN = '\u265b';
  public static final char BLACK_ROOK = '\u265c';
  public static final char BLACK_BISHOP = '\u265d';
  public static final char BLACK_KNIGHT = '\u265e';
  public static final char BLACK_PAWN = '\u265f';
  
  public static final char [] WHITE_BACK_RANK = {
      WHITE_ROOK,
      WHITE_KNIGHT, 
      WHITE_BISHOP,
      WHITE_QUEEN,
      WHITE_KING,
      WHITE_BISHOP,
      WHITE_KNIGHT,
      WHITE_ROOK
  };
  public static final char [] BLACK_BACK_RANK = {
      BLACK_ROOK,
      BLACK_KNIGHT,
      BLACK_BISHOP,
      BLACK_QUEEN,
      BLACK_KING,
      BLACK_BISHOP,
      BLACK_KNIGHT,
      BLACK_ROOK
  };
  
  
  public static void main(String[] args) {
    char [][] board = new char [8][];
    board[0] = WHITE_BACK_RANK;
    board[7] = BLACK_BACK_RANK;
    for (int i = 1; i < 7; i++){
      board [i] = new char [8];
      
    }
    for (int i= 0; i < board [1].length; i++){
      board [1][i] = WHITE_PAWN;
      board [6][i] = BLACK_PAWN;
      
    }
 for (int i = 7; i >= 0; i--){
   for(char c : board [i]){
    System.out.print(c); 
   }
   System.out.println();
 }
  }

}
