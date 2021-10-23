package com.example.orderpeerandroid;

    public class Order {


        private String item;
        private int number;
        private String hour;
        private int x, y;



        public Order(String item, int number, String hour, int x, int y) {

            this.item = item;
            this.number = number;
            this.hour = hour;
            this.x = x;
            this.y = y;

        }


        public Order() {

        }


        public String getItem() {
            return item;
        }


        public void setItem(String item) {
            this.item = item;
        }


        public int getNumber() {
            return number;
        }


        public void setNumber(int number) {
            this.number = number;
        }


        public String getHour() {
            return hour;
        }


        public void setHour(String hour) {
            this.hour = hour;
        }


        public int getX() {
            return x;
        }


        public void setX(int x) {
            this.x = x;
        }


        public int getY() {
            return y;
        }


        public void setY(int y) {
            this.y = y;
        }

    }
