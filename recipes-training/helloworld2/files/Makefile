
helloworld2: helloworld.c
	${CC} -o $@ $?

install: helloworld2
	 mkdir -p $(DESTDIR)$(bindir)
	 install -m 0755 $^ $(DESTDIR)$(bindir)

clean:
	rm -rf helloworld2
