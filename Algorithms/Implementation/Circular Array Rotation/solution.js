// Complete the circularArrayRotation function below.
function circularArrayRotation(a, k, queries) {  
    for (var i = 0; i < k; i++) {
        a.unshift(a.pop());
    }
    
    for(var i = 0; i < queries.length; i++ ){
        queries[i] = a[queries[i]];
    }
    
    return queries;
}
