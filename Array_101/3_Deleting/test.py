a = [1, 2, 3, 1, 2, 4]

while 2 in a:
    print(f'before deletion: {a}...')
    a.remove(2)
    print(f'after deletion: {a}!\n')
