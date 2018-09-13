def produce_files(size):
	if str(size).strip() == '10':
		for i in range(1, 101):
			f = open('./client/10MB-' + str(i), "wb")
			f.seek(10*1024*1024-1)
			f.write(b"\0")
			f.close()

	if str(size).strip() == '1000':
		for i in range(1, 11):
			f = open('./client/1000MB-' + str(i), "wb")
			f.seek(1024*1024*1024-1)
			f.write(b"\0")
			f.close()

if __name__ == '__main__':
	text = input("Please enter file size in MB:")  # Python 2
	produce_files(text)