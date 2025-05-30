fun main() {

    while(true) {

        println("Enter CMD: ");
        val cmd = readln().toString()

        println("Enter Website URL: ")
        val inputHost = readln().toString()

        val list = listOf(cmd, inputHost);

        createRoute(list[0], list[1])
        break;

    }

}

fun createRoute(cmd:String, url: String,): Process {

    val time = Runtime.getRuntime().exec("$cmd $url");
    return time;
}