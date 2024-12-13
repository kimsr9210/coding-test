function solution(array, height) {
    var answer = 0;

    for(let lgh in array){
        if(array[lgh] > height){
            ++answer ;
        }
    }
    return answer;
}