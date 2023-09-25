int	OdOp_strncmp(char *s1, char *s2, unsigned int n)
{
	unsigned int	i;
	unsigned char	c1;
	unsigned char	c2;

	i = 0;
	c1 = s1[i];
	c2 = s2[i];
	while ((c1 != '\0' || c2 != '\0') && i < n)
	{
		if (c1 != c2)
			return (c1 - c2);
		i++;
		c1 = s1[i];
		c2 = s2[i];
	}
	return (0);
}
