
helloworld3: helloworld.c
	${CC} -o $@ -lgpg-error $?

install: helloworld3
	 mkdir -p $(DESTDIR)$(bindir)
	 install -m 0755 $^ $(DESTDIR)$(bindir)

clean:
	rm -rf helloworld2
