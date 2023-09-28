char	*OdOp_strstr(char *str, char *to_find)
{
	int	i;

	if (*to_find == '\0')
		return (str);
	while (*str != '\0')
	{
		if (*str == *to_find)
		{
			i = 0;
			while (str[i] != '\0' && to_find[i] != '\0' && str[i] == to_find[i])
			{
				i++;
			}
			if (to_find[i] == '\0')
				return (str);
			else if (str[i] == '\0')
				return (0);
		}
		str++;
	}
	return (0);
}
