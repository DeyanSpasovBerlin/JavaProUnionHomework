/*
Описание задания.
 1 уровень сложности: Пара задач на группировки , используйте базу данных shop
1) Выведите минимальный рейтинг покупателя среди сделавших заказ в мае 2022 года.
Вывести : minrating
2)Выведите продавцов, которые оформили заказ на наибольшую сумму в период с марта по май 2022 года.
Вывести : sellid, amt


2 уровень сложности: 
*/
USE shop;
SELECT * FROM customers;
SELECT * FROM orders;
SELECT * FROM sellers;
-- 1) Выведите минимальный рейтинг покупателя среди сделавших заказ в мае 2022 года.
    -- a) CUST_ID совершившие покупки в мае
SELECT
CUST_ID
FROM orders
WHERE MONTH(ODATE) = 5;
	-- min rating среди етих CUST_ID
SELECT 
MIN(RATING)
FROM customers
WHERE customers.CUST_ID IN (
							SELECT
							CUST_ID
							FROM orders
							WHERE MONTH(ODATE) = 5
							);
 -- *******************
 -- 2)Выведите продавцов, которые оформили заказ на наибольшую сумму в период с марта по май 2022 года.
     -- a) все продажи с с марта по май
 SELECT
 AMT AS sumToByu,
 SELL_ID 
 FROM orders
WHERE MONTH(ODATE) BETWEEN 3 AND 5;

      -- b) max все продажи с с марта по май
 SELECT 
 max(t1.sumToByu)
         FROM (
				SELECT
				 AMT AS sumToByu,
				 SELL_ID 
				 FROM orders
				WHERE MONTH(ODATE) BETWEEN 3 AND 5
				) AS t1;
		-- c) SELL_ID продавца совершил ету продажу
  SELECT 
  t2.SELL_ID
	FROM (
		 SELECT
		 AMT AS sumToByu,
		 SELL_ID 
		 FROM orders
		WHERE MONTH(ODATE) BETWEEN 3 AND 5
         ) AS t2
    WHERE  t2.sumToByu = (
						 SELECT 
						 max(t1.sumToByu)
								 FROM (
										SELECT
										 AMT AS sumToByu,
										 SELL_ID 
										 FROM orders
										WHERE MONTH(ODATE) BETWEEN 3 AND 5
										) AS t1	
			);
            
            -- d) имя, SELL_ID, CITY етого продавца
 SELECT 
 t3.SNAME,
 t3.SELL_ID,
 t3.CITY
 FROM sellers AS t3
 WHERE t3.SELL_ID = (
					  SELECT 
					  t2.SELL_ID
						FROM (
							 SELECT
							 AMT AS sumToByu,
							 SELL_ID 
							 FROM orders
							WHERE MONTH(ODATE) BETWEEN 3 AND 5
							 ) AS t2
							WHERE  t2.sumToByu = (
												 SELECT 
												 max(t1.sumToByu)
														 FROM (
																SELECT
																 AMT AS sumToByu,
																 SELL_ID 
																 FROM orders
																WHERE MONTH(ODATE) BETWEEN 3 AND 5
																) AS t1	
									)
					);