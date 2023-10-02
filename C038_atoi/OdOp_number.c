int	OdOp_number(char *str, int sign)
{
	int	answer;

	answer = 0;
	while (*str >= '0' && *str <= '9')
	{
		answer *= 10;
		answer += *str - 48;
		str++;
	}
	return (answer * sign);
}
