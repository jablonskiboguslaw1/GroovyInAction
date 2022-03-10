package com.therealdanvega.metaprograming.compiletime

Animal animal1 = new Animal("Dog", "small");
Animal animal2 = new Animal("Dog", "large");
Animal animal3 = new Animal("Cat", "large");
Animal animal4 = new Animal("Cat", "small");


def animals = [animal1, animal2, animal3, animal4]

println animals.toSorted()