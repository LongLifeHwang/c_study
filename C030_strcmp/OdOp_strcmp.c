int	OdOp_strcmp(char *s1, char *s2)
{
	unsigned char	c1;
	unsigned char	c2;

	c1 = *s1;
	c2 = *s2;
	while (c1 || c2)
	{
		if (c1 > c2)
			return (1);
		else if (c1 < c2)
			return (-1);
		c1 = *s1++;
		c2 = *s2++;
	}
	return (0);
}
