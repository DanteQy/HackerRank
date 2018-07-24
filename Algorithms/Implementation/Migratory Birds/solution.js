// Complete the migratoryBirds function below.
function migratoryBirds(ar) {
    var arrId = Array(ar.length).fill(0);
     
    for(var i = 0; i < ar.length; i++){
        arrId[ar[i]]++; 
    }
    
    var max = arrId[0];
    var maxIndex = 0;
    for(var i = 0; i < arrId.length; i++){
        if(arrId[i] > max){
            max = arrId[i];
            maxIndex = i;
        }
            
    }
     
    return maxIndex;
}
