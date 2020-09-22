package com.zy.chapter6;

 enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

class  Test{
    public static void main(String[] args) {
        System.out.println(Spiciness.NOT.ordinal());
    }

}