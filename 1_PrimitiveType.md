### Primitive Types

#### Count the number of bits
- Python
```python
def CountBits(x):
    num_bits = 0
    while(x!=0):
        num_bits +=x&1
        x>>=1
    return num_bits

print(CountBits(3))

#Output: 2
```
- Java
```Java
public class CountBits{
    public static short num_bits(int x){
    short num_bits = 0;
    while(x!=0){
        num_bits += x&1;
        x>>=1;
    }
    return num_bits;
}
     public static void main(String []args){
        System.out.print(num_bits(3));
     }
}
//2
```
