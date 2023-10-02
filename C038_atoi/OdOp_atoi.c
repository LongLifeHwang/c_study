int	OdOp_atoi(char *str)
{
	int	sign;

	sign = 1;
	str = OdOp_sign(str, &sign);
	return (OdOp_number(str, sign));
}
