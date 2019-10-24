package cz.oksystem.kerberostest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KerberosTestApplication

fun main(args: Array<String>) {
	runApplication<KerberosTestApplication>(*args)
}
