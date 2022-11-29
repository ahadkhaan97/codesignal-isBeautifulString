fun main() {
    print(solution("bbbaacdafe"))
}

fun solution(inputString: String): Boolean {
    val map = HashMap<Char, Int>()
    for (i in 97 until 123) {
        map[i.toChar()] = 0
    }

    for (i in inputString.indices) {
        map[inputString[i]] = map[inputString[i]]!! + 1
    }

    for (i in 97 until 122) {
        if (map[i.toChar()]!! < map[(i + 1).toChar()]!!) {
            return false
        }
    }

    return true
}