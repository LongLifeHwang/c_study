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
