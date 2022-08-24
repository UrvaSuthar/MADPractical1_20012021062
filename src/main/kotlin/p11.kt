class Matrix(private val matrix: Array<IntArray>, private val noOfrow: Int, private val noOfcol: Int) {
    override fun toString(): String {
        var res = "($noOfrow x $noOfcol Matrix): \n"
        for (i in matrix) {
            for (j in i) {
                res += "$j\t"
            }
            res += "\n"
        }
        return res
    }

    operator fun plus(obj: Matrix): Matrix {
        val sum = Array(this.noOfrow) { IntArray(this.noOfcol) }
        for (i in 0 until this.noOfrow) {
            for (j in 0 until this.noOfcol) {
                sum[i][j] = this.matrix[i][j] + obj.matrix[i][j]
            }
        }
        return Matrix(sum, this.noOfrow, this.noOfcol)
    }

    operator fun minus(obj: Matrix): Matrix {
        val sub = Array(this.noOfrow) { IntArray(this.noOfcol) }
        for (i in 0 until this.noOfrow) {
            for (j in 0 until this.noOfcol) {
                sub[i][j] = this.matrix[i][j] - obj.matrix[i][j]
            }
        }
        return Matrix(sub, this.noOfrow, this.noOfcol)
    }

    operator fun times(obj: Matrix): Matrix {
        val mul = Array(this.noOfrow) { IntArray(obj.noOfcol) }
        for (i in 0 until this.noOfrow) {
            for (j in 0 until obj.noOfcol) {
                mul[i][j] = 0
                for (k in 0..obj.noOfcol) {
                    mul[i][j] += this.matrix[i][k] * obj.matrix[k][j]
                }
            }
        }
        return Matrix(mul, this.noOfrow, obj.noOfcol)
    }
}

fun main() {
    val firstMatrix = Matrix(
        arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2,
        3
    )
    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(2, 3), intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ), 3, 2
    )
    val secondMatrix2 = Matrix(
        arrayOf(
            intArrayOf(6, 3), intArrayOf(9, 0),
            intArrayOf(5, 4)
        ), 3, 2
    )
    println("*********************** Addition ***********************")
    println ("Matrix 1 : ")
    println(secondMatrix2.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val addMatrix = secondMatrix2 + secondMatrix1
    println ("Addition : $addMatrix")
    println("*********************** Subtraction ***********************")
    println ("Matrix 1 : ")
    println(secondMatrix2.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val subMatrix = secondMatrix2 - secondMatrix1
    println ("Subtraction : $subMatrix")
    println("*********************** Multiplication ***********************")
    println ("Matrix 1 : ")
    println(firstMatrix.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val mulMatrix = firstMatrix * secondMatrix1
    println ("Multiplication : $mulMatrix")
}