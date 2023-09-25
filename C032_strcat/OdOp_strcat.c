char	*OdOp_strcat(char *dest, char *src)
{
	int		i;
	int		dest_i;

	i = 0;
	dest_i = 0;
	while (dest[dest_i])
	{
		dest_i++;
	}
	while (src[i])
	{
		dest[dest_i + i] = src[i];
		i++;
	}
	dest[dest_i + i] = '\0';
	return (dest);
}
