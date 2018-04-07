object Ccalconv {
    def main(args: Array[String]): Unit = {
        for (seireki <- 1926 to 1935) {
            print(s"西暦${seireki}年は、")
            var syowa = seireki - 1925
            println(s"昭和${syowa}年です。")
        }
    }
}
