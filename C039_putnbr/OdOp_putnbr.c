#include <unistd.h>

void	OdOp_putnbr(int nb)
{
	char	c;
	int		i;

	if (nb == -2147483648)
	{
		write(1, "-2147483648", 11);
		return ;
	}
	else if (nb < 0)
	{
		nb = -nb;
		write(1, "-", 1);
	}
	while (nb > 9)
	{
		i = nb / 10;
		OdOp_putnbr(i);
		nb = nb % 10;
	}
	c = nb + 48;
	write(1, &c, 1);
}
