-- data1: SQL statement used to fetch detailed fault data per site
SELECT
    site_number AS site_number,
    site_name AS site_name,
    DAY(LAST_DAY(period_start_time)) as service_period_days,
    DATE_FORMAT(period_start_time,'%d-%b-%Y') AS start_date,
    DATE_FORMAT(period_start_time,'%H:%i:%s') AS start_time,
    DATE_FORMAT(date_time_cleared,'%d-%b-%Y') AS end_date,
    DATE_FORMAT(date_time_cleared,'%H:%i:%s') AS end_time,
    CONVERT(TIMEDIFF(date_time_cleared, period_start_time), CHAR) down_time_hrs,
    TIMESTAMPDIFF(MINUTE, period_start_time, date_time_cleared) down_time_min,
    fault_type AS fault
FROM ps_ndirop_fault_raw
WHERE network=$parameterMap.NTYPE AND
        SERVICE_AFFECTING = 'Y' AND
        YEAR(period_start_time) = $parameterMap.Year AND
        MONTH(period_start_time) = $parameterMap.Month
ORDER BY site_name, period_start_time;