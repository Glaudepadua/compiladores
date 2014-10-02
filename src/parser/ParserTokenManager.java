/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package parser;
import java.io.*;
import recovery.*;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x9fffb800L) != 0L)
         {
            jjmatchedKind = 55;
            return 25;
         }
         if ((active0 & 0x240000000L) != 0L)
         {
            jjmatchedKind = 55;
            return 5;
         }
         if ((active0 & 0x10000000000000L) != 0L)
            return 8;
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 55;
            return 15;
         }
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 55;
            return 31;
         }
         return -1;
      case 1:
         if ((active0 & 0x9fffd800L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 1;
            return 25;
         }
         if ((active0 & 0x240000000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 1;
            return 0;
         }
         if ((active0 & 0x2000L) != 0L)
            return 25;
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 1;
            return 36;
         }
         return -1;
      case 2:
         if ((active0 & 0x100000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 2;
            }
            return 35;
         }
         if ((active0 & 0x11024000L) != 0L)
            return 25;
         if ((active0 & 0x2cefd9800L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 2;
            }
            return 25;
         }
         return -1;
      case 3:
         if ((active0 & 0x1c6ef8000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 3;
            return 25;
         }
         if ((active0 & 0x208101800L) != 0L)
            return 25;
         return -1;
      case 4:
         if ((active0 & 0x46ae0000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 4;
            return 25;
         }
         if ((active0 & 0x180418000L) != 0L)
            return 25;
         return -1;
      case 5:
         if ((active0 & 0x44a00000L) != 0L)
            return 25;
         if ((active0 & 0x20e0000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 5;
            return 25;
         }
         return -1;
      case 6:
         if ((active0 & 0xa0000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 6;
            return 25;
         }
         if ((active0 & 0x2040000L) != 0L)
            return 25;
         return -1;
      case 7:
         if ((active0 & 0xa0000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 7;
            return 25;
         }
         return -1;
      case 8:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 8;
            return 25;
         }
         if ((active0 & 0x20000L) != 0L)
            return 25;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 37:
         return jjStopAtPos(0, 45);
      case 40:
         return jjStopAtPos(0, 46);
      case 41:
         return jjStopAtPos(0, 47);
      case 42:
         return jjStopAtPos(0, 43);
      case 43:
         return jjStopAtPos(0, 41);
      case 44:
         return jjStopAtPos(0, 51);
      case 45:
         return jjStopAtPos(0, 42);
      case 46:
         return jjStartNfaWithStates_0(0, 52, 8);
      case 47:
         return jjStopAtPos(0, 44);
      case 59:
         return jjStopAtPos(0, 50);
      case 60:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 61:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 62:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 91:
         return jjStopAtPos(0, 54);
      case 93:
         return jjStopAtPos(0, 53);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2400000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x140000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10a2000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x10000800L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x240000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x80a00000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 123:
         return jjStopAtPos(0, 48);
      case 125:
         return jjStopAtPos(0, 49);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x250000000L);
      case 70:
      case 102:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 25);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x110000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1020000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x6005000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100400000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0xa00000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000800L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200210000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100009000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80080000L);
      case 82:
      case 114:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 25);
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8100000L);
      case 84:
      case 116:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x40060000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 87:
      case 119:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 68:
      case 100:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 25);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 25);
         break;
      case 69:
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 25);
         return jjMoveStringLiteralDfa4_0(active0, 0x80060000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 76:
      case 108:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 25);
         return jjMoveStringLiteralDfa4_0(active0, 0x2088000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 84:
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 25);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 25);
         return jjMoveStringLiteralDfa5_0(active0, 0x2080000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 75:
      case 107:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 25);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x840000L);
      case 82:
      case 114:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 25);
         return jjMoveStringLiteralDfa5_0(active0, 0x40020000L);
      case 83:
      case 115:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 25);
         break;
      case 84:
      case 116:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 67:
      case 99:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 25);
         break;
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 69:
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 25);
         break;
      case 70:
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 71:
      case 103:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 25);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 78:
      case 110:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 78:
      case 110:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(6, 25, 25);
         break;
      case 83:
      case 115:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(6, 18, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(8, 17, 25);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(9, 19, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 52;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     jjCheckNAddStates(0, 4);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(5, 7);
                  else if (curChar == 46)
                     jjCheckNAdd(8);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjAddStates(8, 10);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 7:
                  if (curChar == 46)
                     jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(8);
                  break;
               case 17:
                  if (curChar == 34)
                     jjCheckNAddStates(5, 7);
                  break;
               case 18:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 20:
                  if ((0x8400002400L & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 21:
                  if (curChar == 34 && kind > 9)
                     kind = 9;
                  break;
               case 22:
                  if (curChar == 10)
                     jjCheckNAddStates(5, 7);
                  break;
               case 23:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddStates(0, 4);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(47);
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(48, 49);
                  break;
               case 49:
                  if (curChar != 46)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(50);
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(50);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(51, 7);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 36:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 43;
                  else if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x200000002000L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 31:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 44;
                  else if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x1000000010000L & l) != 0L)
                     jjAddStates(11, 13);
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 35:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x40000000400000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 15:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(25);
                  }
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 1:
                  jjCheckNAddStates(8, 10);
                  break;
               case 9:
                  if ((0x2000000020L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 10:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(9);
                  break;
               case 11:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(9);
                  break;
               case 14:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 16:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 18:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 19:
                  if (curChar == 92)
                     jjAddStates(14, 15);
                  break;
               case 20:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 24:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(25);
                  break;
               case 26:
                  if ((0x1000000010000L & l) != 0L)
                     jjAddStates(11, 13);
                  break;
               case 27:
                  if ((0x800000008L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 28:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 32:
                  if ((0x2000000020L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 33:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 37:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if ((0x1000000010L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 39:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 10);
                  break;
               case 18:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 7);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 52 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   47, 48, 49, 51, 7, 18, 19, 21, 1, 2, 4, 31, 37, 45, 20, 23, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, "\75", "\76", "\74", "\75\75", "\76\75", 
"\74\75", "\41\75", "\53", "\55", "\52", "\57", "\45", "\50", "\51", "\173", "\175", 
"\73", "\54", "\56", "\135", "\133", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffffffffbc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[52];
private final int[] jjstateSet = new int[104];
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 52; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}