echo "enter a number"
read n
echo "even numbers"
i=1
while[$i -le $n]
do
rs='expr $i %2'
if[$rs==0]
then
echo" $i"
fi
((++i))
done