// Complete the kangaroo function below.
function kangaroo(x1, v1, x2, v2) {
    var posX1 = x1, posX2 = x2;
    
    if(v1 < v2){
        return "NO"; 
    } else if(x1 % 2 == 1 && x2 % 2 == 0 && v2 % 2 == 0 && 
              v1 % 2 == 0){
              return "NO";
    }
    else {
        while(posX1 <= posX2){
            posX1 += v1;
            posX2 += v2;
            if(posX1 == posX2) {
                return "YES"; 
                
            } 
        }
    }
         
    return "NO"; 
    
    
    
}
