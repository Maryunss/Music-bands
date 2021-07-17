fun main () {
    println("Список названий групп, информация о которых доступна в программе:")
    println(
                "1.Кино \n" +
                "2.Король и Шут \n" +
                "3.Сектор газа \n" +
                "4.Slipknot \n" +
                "5.Rammstein."
    )
    println("Введите название группы, о которой вы хотите узнать информацию: ")
    val name = readLine()
    val kino = Band()
    kino.name = "Kino"
    kino.sayInfo()
    println(kino.personToString())
}
class Band {
    var name: String = "Undefined"
    fun sayInfo() {
        println("$name")
    }

    fun personToString(): String {
        return "Годы: 1982—1990\n" +
                "Страна: СССР\n" +
                "Город: Ленинград\n" +
                "Жанры: рок, постпанк, новая волна\n" +
                "Лейблы: «АнТроп», «Яншива Шела», «Мелодия», «Мороз Рекордз»\n" +
                "Участники: Виктор Цой, Алексей Рыбин, Олег Валинский, Юрий Каспарян, Александр Титов, Георгий Гурьянов, Игорь Тихомиров"
    }
}







