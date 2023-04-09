fun main(args: Array<String>) {
    /*val inputString = "java kotlin python javascript nodejs go react react native swift"
    val vowels = "aeiouAEIOU"
    val vowels2 = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"
    var result = ""
    var result2 = ""
    var word = ""

    for (char in inputString) {
        if (char in vowels) {
            result += char
        } else if (char in vowels2) {
            result2 += char
        }
    }
      word += result[0]
      word += result2[5]
      word += result2[19]
      word += result2[23]
      word += result[2]
      word += result[3]
      word += result2[19]
    println(word)
    println("Гласные буквы: $result")
    println("Гласные буквы: $result2")*/
    /*val numbers = listOf(9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233) // заданные цифры
    val digits = numbers.flatMap { it.toString().toList() } // преобразуем все числа в одну последовательность цифр
    val sortedDigits = digits.sortedDescending() // сортируем цифры в порядке убывания
    println(sortedDigits.joinToString())
    println(numbers.sortedDescending().joinToString())*/
    /*val numbers = listOf(10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38)
    val chetnyi = mutableListOf<Int>()
    val nechetnyi = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            chetnyi.add(number) // добавляем четное число
        } else {
            nechetnyi.add(number) // добавляем нечетное число
        }
    }
    println("Четные числа: ${chetnyi.joinToString()}")
    println("Нечетные числа: ${nechetnyi.joinToString()}")*/
    val numbers = listOf(12001, 29384, 12384, 909345, 34289, 1, 2, 3)
    var summachetnyh = 0
    var umnojenienechetnyh = 1
    for (number in numbers) {
        if (number % 2 == 0) {
            summachetnyh += number // прибавляем четное число
        } else {
            umnojenienechetnyh *= number // умножаем нечетное число
        }
    }
    println("Сумма четных чисел: $summachetnyh")
    println("Произведение нечетных чисел: $umnojenienechetnyh")


}