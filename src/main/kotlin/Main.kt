fun main() {

    while(true) {

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

fun createRoute(cmd:String, url: String,): Process {

    val time = Runtime.getRuntime().exec("$cmd $url");
    return time;
}