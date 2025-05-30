fun main() {

    while(true) {

        println("Enter CMD: ");
        val cmd = readln().toString()

        println("Enter Website URL: ")
        val inputHost = readln().toString()

        createRoute(cmd, inputHost)
        break;

    }

}

fun createRoute(cmd:String, url: String,): Process {

    val time = Runtime.getRuntime().exec("$cmd $url");
    return time;
}