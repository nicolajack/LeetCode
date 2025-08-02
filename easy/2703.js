/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    score = 0;
    for (let i = 0; i < args.length; i++){
        score++
    }
    return score;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
