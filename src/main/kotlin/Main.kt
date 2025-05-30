fun main() {

    while(true) {

        println(createTitle("PROCESS | WEBSITE Opener"))

        println("Enter CMD: ");
        val cmd = readln().toString()

        println("Enter Website URL: ")
        val inputHost = readln().toString()

        val list = listOf(cmd, inputHost);

        list.forEach { e ->
            createRoute(e[0].toString(), e[1].toString())
        }

        break;

    }

}

fun createTitle(title: String): String {
    return title;
}

fun createRoute(cmd:String, url: String,): Process {

    val time = Runtime.getRuntime().exec("$cmd $url");
    return time;
}