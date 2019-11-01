
helloworld4: helloworld.c
	${CC} ${CFLAGS} ${LDFLAGS} -o $@ $?

install: helloworld4
	 mkdir -p $(DESTDIR)$(bindir)
	 install -m 0755 $^ $(DESTDIR)$(bindir)

clean:
	rm -rf helloworld4
