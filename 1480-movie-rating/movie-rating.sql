(select name as results from movierating 
join users using(user_id)
group by name
order by count(*) desc,name 
limit 1)

union all

(select title as results from movierating
join movies using(movie_id)
where created_at between '2020-02-01' and '2020-02-29'
group by title
order by avg(rating) desc,title
limit 1) 

/*(
    SELECT u.name AS results
    FROM Users u
    JOIN MovieRating mr
        ON u.user_id = mr.user_id
    GROUP BY u.user_id, u.name
    ORDER BY COUNT(*) DESC, u.name ASC
    LIMIT 1
)

UNION ALL

(
    SELECT m.title AS results
    FROM Movies m
    JOIN MovieRating mr
        ON m.movie_id = mr.movie_id
    WHERE mr.created_at >= '2020-02-01'
      AND mr.created_at < '2020-03-01'
    GROUP BY m.movie_id, m.title
    ORDER BY AVG(mr.rating) DESC, m.title ASC
    LIMIT 1
);*/
