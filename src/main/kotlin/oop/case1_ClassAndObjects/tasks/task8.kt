package org.example.oop.case1_ClassAndObjects.tasks

/*

Описание задачи:
Создайте систему, моделирующую процесс покупок в магазине.

Классы "Покупатель" и "Корзина"

    Классы и их описание:

    Класс Product
    Свойства:
    name — название продукта (строка).
    price — цена продукта (целое число).

    Класс Cart
    Свойства:
    products — список продуктов (изначально пустой).
    Методы:
    addProduct(product: Product){
        добавляет продукт в корзину.
    }
    getTotalPrice() : Int{
        возвращает общую стоимость всех продуктов в корзине.
    }
    checkout(balance : Int){
        если стоимость всех продуктов в корзине равна вашему балансу то
        выводит сообщение с информацией о покупке: список продуктов и итоговую стоимость,
        и очищает корзину.
        Если ваш баланс меньше или больше, сообщить сколько не хватает или насколько перебор
    }

    Задача: Вас послали в магазин со списком продуктов которые вам необходимо купить:
    Молоко, Хлеб, Сахар
    У Вас на балансе 450 рублей, вам необходимо добавить продуктов в корзину ровно на эту стоимость.
    Стоимость других продуктов не может быть больше 80 рублей,
    Вам нужно потратить все деньги, так чтобы на балансе было 0 рублей

 */

class Product(
    val name: String,
    val price: Int
)

class Cart(
    private var products: MutableList<Product> = mutableListOf()
) {
    fun addProduct(product: Product) {
        products.add(product)
    }
    fun getTotalPrice(): Int {
        var total = 0
        products.forEach {
            total += it.price
        }
        return total
    }
    fun checkout(balance: Int): Int {
        val totalPrice = getTotalPrice()
        return if (totalPrice - balance <= 0) {
            println("Информация о покупке: ")
            println("Итоговая стоимость: $totalPrice")
            println("Успешно оплачено!")
            products.clear()
            balance - totalPrice
        } else {
            println("Недостаточно денег!")
            println("Ваш баланс: $balance")
            println("Стоимость покупок: $totalPrice")
            if (totalPrice > balance) {
                println("Вам не хватило ${totalPrice - balance}")
            } else {
                println("Вы переплатили на ${balance - totalPrice}")
            }
            balance
        }
    }
}

fun main() {
    var balance = 450
    val milk = Product("Молоко", 67)
    val bread = Product("Хлеб", 45)
    val sugar = Product("Сахар", 78)

    val cart = Cart()

    cart.addProduct(milk)
    cart.addProduct(bread)
    cart.addProduct(sugar)

    println("Общая стоимость: ${cart.getTotalPrice()}")

    balance = cart.checkout(balance)
    println("Остаток на балансе: $balance")
}