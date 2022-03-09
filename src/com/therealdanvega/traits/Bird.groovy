package com.therealdanvega.traits

class Bird implements FlyingAbility, SpeakingAbility {






    static void main(String[] args) {
        Bird b = new Bird()


        println b.fly()
        println b.speak()
    }

    @Override
    String doSomething() {

    }


}




