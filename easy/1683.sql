# Write your MySQL query statement below
SELECT T.tweet_id
FROM Tweets T
WHERE CHAR_LENGTH(T.content) > 15
