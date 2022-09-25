def sum_divisors(n):

    result = 0

    for num in range(1, n+1):
        if n % num == 0:
            result += num

    return result



