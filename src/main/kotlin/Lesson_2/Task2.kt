package org.example.Lesson_2

fun main() {
        val commonWorkers = 50
        val commonWorkersSalary = 30_000
        val traineeWorkers = 30
        val traineeWorkersSalary = 20_000

        val constWorkersSalary = commonWorkers*commonWorkersSalary
        val commonSalary = constWorkersSalary+traineeWorkersSalary*traineeWorkers
        val meanSalary = commonSalary/(commonWorkers+traineeWorkers)

        println(constWorkersSalary)
        println(commonSalary)
        println(meanSalary)
}