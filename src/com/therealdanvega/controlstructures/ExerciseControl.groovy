package com.therealdanvega.controlstructures

class ExerciseControl {


}


class Account {

    BigDecimal balance = 0.0

    def deposit(BigDecimal amount) {


        if (amount < 0) {
            throw new Exception("Deposit amount must be greater than zero")
        } else
            balance += amount
    }

    def deposit(List amounts) {
        for (amount in amounts) {
            deposit(amount)
        }
    }

    static void main(String[] args) {
        Account checking = new Account()
        checking.deposit(10)
        println(checking.balance)

        try {
            checking.deposit(-1.0)
        } catch (Exception e) {
            println e.message
        }

        println checking.balance

        checking.deposit([3, 1, 5, 6, 7.8])

        println checking.balance
    }


}