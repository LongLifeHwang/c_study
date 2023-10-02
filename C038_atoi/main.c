#include <stdio.h>

char	*OdOp_sign(char *str, int *sign)
{
	while (*str == 32 || (*str >= 9 && *str <= 13))
		str++;
	while (1)
	{
		if (*str == '-')
			*sign *= -1;
		else if (*str != '+')
			return (str);
		str++;
	}
}

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

int	OdOp_atoi(char *str)
{
	int	sign;

	sign = 1;
	str = OdOp_sign(str, &sign);
	return (OdOp_number(str, sign));
}

