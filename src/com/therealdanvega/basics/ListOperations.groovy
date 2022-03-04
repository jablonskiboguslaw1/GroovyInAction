package com.therealdanvega.basics

class ListOperations {

    static void main(String[] args) {


        List nums = [1, 2, 3, 4, 53, 2, 1, 4, 6, 4]
        println nums
        println nums.class.name
        nums.push(99)
        println nums

        nums.putAt(0, 66)
        println nums
        nums[0] = 77

        println nums + [3, 4, 5]
        println nums

        nums << 88

        println nums


        nums.pop()
        nums.removeAt(0)
        def newList = nums - 1
        println newList
        println('+++++++++++=')
        println nums
        println nums[5]

        def retrieved = nums.getAt(0..4)
        println retrieved

for (x in retrieved)
{
    println(x)
}
        println("++++++++++++++++++++++++++++++===")

        retrieved << [4,5,6]
        retrieved << [7,7,7]


        println retrieved.flatten()
        println retrieved

        println(retrieved.flatten().unique())


        def numbers = [3,4,5,6,7,32,1,35,6,7,3,1,2,4] as SortedSet
        println numbers
        print(numbers.class.name)


    }





}
