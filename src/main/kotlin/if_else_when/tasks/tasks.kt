package if_else_when.tasks


import kotlin.random.Random


/*
Task1: Чётное или нечётное число

Задание: Попроси пользователя ввести число.
Определи, является ли число чётным или нечётным, и выведи соответствующее сообщение.
*/
fun task1() {
    print("Введите любое число: ")
    val number = readLine()!!.toInt()
    if ((number % 2) == 0) {
        println("Чётное")
    }
    else {
        println("Нечётное")
    }
}

/*
Task2: Определение возраста

Задание: Попроси пользователя ввести свой возраст.
Если ему меньше 18 лет, выведи сообщение "Вы ещё подросток".
Если от 18 до 65, выведи "Вы взрослый". Если больше 65, выведи "Вы пенсионер".
*/
fun task2() {
    print("Введите свой возраст: ")
    val age = readLine()!!.toInt()
    if (age <= 18) {
        println("Вы ещё подросток")
    }
    else if (age >= 65) {
        println("Вы пенсионер")
    }
    else {
        println("Вы взрослый")
    }
}

/*
Task3: Калькулятор скидки

Задание: Попроси пользователя ввести сумму покупки.
Если сумма больше 1000, предоставь скидку 10% и выведи итоговую сумму.
В противном случае выведи сумму без изменений.
*/
fun task3() {
    print("Введите сумму вашей покупки: ")
    var cost = readLine()!!.toInt()
    if (cost >= 1000) {
        cost = cost/100*90
    }
    println(cost)
}

/*
Task4: Максимальное из двух чисел

Задание: Попроси пользователя ввести два числа.
Определи и выведи на экран большее из них.
*/
fun task4() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()
    if (num1 > num2) {
        println("$num1 больше $num2")
    }
    else {
        println("$num2 больше $num1")
    }
}

/*
Task5: Игра "Угадай число"

Задание: Сгенерируй случайное число от 1 до 5.
Попроси пользователя угадать число. Если он угадал, выведи "Поздравляем, вы угадали!", иначе выведи "Неправильно, попробуйте ещё раз".
*/
fun task5() {
    val rand = Random.nextInt(1, 5)
    while (true) {
        print("Угадайте число от 1 до 5: ")
        val num = readLine()!!.toInt()
        if (num == rand) {
            println("Поздравляем, вы угадали!")
            break
        }
        println("Неправильно, попробуйте ещё раз")
    }
}

/*
Task6: Проверка пароля

Задание: Установи в программе пароль, например, "1234".
Попроси пользователя ввести пароль. Если введённый пароль совпадает, выведи "Доступ разрешен", иначе "Доступ запрещен".
*/
fun task6() {
    val pass = 1234
    while (true) {
        print("Введите пароль: ")
        val num = readLine()!!.toInt()
        if (num == pass) {
            println("Доступ разрешен")
            break
        }
        println("Неверный пароль, попробуйте ещё раз")
    }
}

/*
Task7: Определение знака числа

Задание: Попроси пользователя ввести число.
Определи, положительное оно, отрицательное или равно нулю, и выведи соответствующее сообщение.
*/
fun task7() {
    print("Введите любое число: ")
    val num = readLine()!!.toInt()
    if (num > 0) {
        println("Число положительное")
    }
    else if (num < 0) {
        println("Число отрицательное")
    }
    else {
        println("Число равно нулю")
    }
}

/*
Task8: Калькулятор простых операций

Задание: Попроси пользователя ввести два числа и операцию (+, -, *, /).
Выполни указанную операцию и выведи результат.
*/
fun task8() {
    print("Введите число: ")
    val num1 = readLine()!!.toInt()
    print("Введите операцию: ")
    val op = readLine()!!.toString()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    if (op == "+") {
        println(num1 + num2)
    }
    else if (op == "-") {
        println(num1 - num2)
    }
    else if (op == "*") {
        println(num1 * num2)
    }
    else if (op == "/") {
        println(num1 / num2)
    }
}

/*
Task9: Определение високосного года

Задание: Попроси пользователя ввести год.
Определи, является ли этот год високосным, и выведи результат.
*/
fun task9() {
    val year = readLine()!!.toInt()

    if (year % 4 != 0) {
        println("Год не високосный.")
    }
    else if (year % 100 == 0) {
        if (year % 400 == 0) {
            println("Год високосный.")
        }
        else {
            println("Год не високосный.")
        }
    }
    else {
        println("Год високосный.")
    }
}

/*
Task10: Определение буквы

Задание: Попроси пользователя ввести букву.
Определи, является ли она гласной или согласной, и выведи соответствующее сообщение.
*/
fun task10() {
    val letter = readLine()!!.toString()

    fun isVowel(letter_0: String): Boolean {
        when (letter_0.first().lowercaseChar()) {
            'a', 'e', 'i', 'o', 'u', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё' -> return true
        }
        return false
    }

    val final = isVowel(letter)
    if (final == true) {
        println("Ваша буква - гласная")
    }
    else {
        println("Ваша буква - согласная")
    }
}

fun main(){
    task1()
    println()
    task2()
    println()
    task3()
    println()
    task4()
    println()
    task5()
    println()
    task6()
    println()
    task7()
    println()
    task8()
    println()
    task9()
    println()
    task10()
    println()
}