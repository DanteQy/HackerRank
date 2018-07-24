// Complete the countApplesAndOranges function below.
function countApplesAndOranges(s, t, a, b, apples, oranges) {
     
    var countApples = 0;
    var countOranges = 0;
    
    for(var i = 0; i < apples.length; i++){
        if(a+apples[i] >= s && a+apples[i] <= t) countApples++;
        
    }
    
    for(var i = 0; i < oranges.length; i++){
        if(b+oranges[i] >= s && b+oranges[i] <= t) countOranges++; 
    }
    console.log(countApples);
    console.log(countOranges);

}
