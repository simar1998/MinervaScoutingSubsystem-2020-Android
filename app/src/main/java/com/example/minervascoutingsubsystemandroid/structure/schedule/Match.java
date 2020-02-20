package com.example.minervascoutingsubsystemandroid.structure.schedule;
/*

 */
public class Match {


        private int red1;
        private int red2;
        private int red3;
        private int blue1;
        private int blue2;
        private int blue3;
        private int matchNum;


        public void match(int r1,int r2,int r3,int b1,int b2,int b3) {
            this.setR1(r1);
            this.setR2(r2);
            this.setR3(r3);
            this.setB1(b1);
            this.setB2(b2);
            this.setB3(b3);

        }


        public int getR1() {
            return red1;
        }


        public void setR1(int r1) {
            this.red1 = r1;
        }


        public int getR2() {
            return red2;
        }


        public void setR2(int r2) {
            this.red2 = r2;
        }


        public int getR3() {
            return red3;
        }


        public void setR3(int r3) {
            this.red3 = r3;
        }


        public int getB1() {
            return blue1;
        }


        public void setB1(int b1) {
            this.blue1 = blue1;
        }


        public int getB2() {
            return blue2;
        }


        public void setB2(int b2) {
            this.blue2 = b2;
        }


        public int getB3() {
            return blue3;
        }


        public void setB3(int b3) {
            this.blue3 = b3;
        }


        public int getMatchNum() {
            return matchNum;
        }


        public void setMatchNum(int matchNum) {
            this.matchNum = matchNum;
        }

    @Override
    public String toString() {
        return "Match{" +
                "red1=" + red1 +
                ", red2=" + red2 +
                ", red3=" + red3 +
                ", blue1=" + blue1 +
                ", blue2=" + blue2 +
                ", blue3=" + blue3 +
                ", matchNum=" + matchNum +
                '}';
    }

    public char getAllianceColour(int team){
            if(team == red1 || team == red2 || team == red3){
                return 'r';
            }
            else {
                return 'b';
            }
    }

    public int getTeam(int i){

            int teamNum = 0;
            switch (i) {
                case 1:
                    teamNum = red1;
                case 2 :
                    teamNum = red2;
                case 3 :
                    teamNum = red3;
                case 4:
                    teamNum = blue1;
                case 5 :
                    teamNum = blue2;
                case 6 :
                    teamNum = blue3;
            }
            return teamNum;
    }
}
