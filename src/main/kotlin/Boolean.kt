fun main() {
    val nilai = 89
    val A = 90
    val B = 80
    val C = 70
    val D = 60
    val E = 50
    if (nilai > A) {
        print("Nilai Anda A")
    }
    else if (nilai < A && nilai > B){
        print("Nilai Anda B")
    }
    else if (nilai < B && nilai > C) {
        print("Nilai Anda C")
    }
    else if (nilai < C && nilai > D) {
        print("Nilai Anda D")
    }
    else if (nilai < D && nilai > E) {
        print("Nilai Anda E")
    }
    else {
        print("Nilai Anda F")
    }
}
