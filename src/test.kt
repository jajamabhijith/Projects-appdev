import kotlin.math.log2
fun main(){
    var (n,k) = readLine()!!.split(' ').map({it.toInt()})
    var x = 0
    var y = n-k
    if(k>n || (k==1 && isPowerOfTwo(n.toDouble())==0)){
        print("NO")
    } else{
        println("YES")
        if(n<2*k){
            for(i in 1..n-k){
                print(2)
                print(' ')
            }
            for(i in n-k+1..n){
                print(1)
                print(' ')
            }
        }else{
            while(y!=0){
                if(isPowerOfTwo(y+1.0)==1){
                    print(1+y)
                    print(' ')
                    x++
                    break
                }else {
                    print(1+get(y))
                    print(' ')
                    y-=get(y)+1
                    x++
                }
            }
            for(i in x+1..k){
                print(1)
                print(' ')
            }
        }
    }
}
fun isPowerOfTwo(n:Double):Int{
    if(Math.ceil(log2(n))==Math.floor(log2(n))){
        return 1
    }else{
        return 0
    }
}
fun get(number:Int):Int{
    var res = 2
    while(res*2<number){
        res*=2
    }
    res--
    return res
}