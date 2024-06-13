package egovframework.example.cmmn.web;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import go.mdds.sdk.util.CipherUtil;

/**
 * @author GOOJAEHO
 *
 */
public class DecryptSample {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		System.out.println("테스트 시작");
		
		//String orgData = "vKwI/chOrH0lOzm3wFZWMwNVAX5pz2M5aqP0aMmuc5SsknZpNqkN7twX21USHalrZ/XeQJ95xstYpK65h4Zgz7MgNY/0j0B5M625PLxWb9U0PM9fM0PoNuACdCPERMmyaKkPws+WMBrioN8ij4YZ52cqRX/MA+ZYMJzIJRl364t1xljwakoswH0V7IYwkXy+YVXGkw/NogIkQpvoxCDjN+qFUe5TClletkdb39wfWVhhk1wUc9dLL7JDO2oBOXa3Jy8FRkOsuDSRQ0athSqwJiMfekiOisQl+Nd50cM/G6hi74b50JpbBrk3EbHSJlogVhyQLYaNpVZlqzbHCZaPaHHVA/p1rOqcpGAz2Ip+Te0kkNeA1b1ilvaR2Ii4FyCoaQt5TQ7OI+YgjL2kFp4ZBX6mBhKZsS5YCQp/a49RaKVb+kBZ5cvqCQZWR9Dr45iDcb8gTvKCmlTNjPZCxTl/2nj4B9JX1BfOs8af3yFNvaRWdFBuU3Cu/rOtCVRu7v3/OkZEBEt6Zl6xk4o1YBVD7Fkm4BTVs68vZIfd/GrzG8m8SS5N7pksE34DgWb0qkOrL/EcGLdiiAFRYELhCuY1qEFoLicyIlpLlJEx7vI/iSM/8qA1Ymov/XH1BprJrHWXWP03UQ0WvxBEfqf6tk6hTC0x3RZSMtn/yGKhDzVVCt9zG6CuRHl2hO7cfvdlaJLbkX+XEtVByJmBnJf60z7jft5QRoo73mF4oyT3eSkzTM22eCs6vrFtFTWs0JYyZhCWzY71WI47zgjvt4Mub7T+eirs7uAR/qrq1U0m9+J2VznHEKT657v5aoIZ0NpKyUClMucn1i3OEmmvg1aOQEX66mD982efCXQ+Q918Z7C8LU8=";
		//String orgData = "33dQ/u1aSp4t2lM0GbAIMx4BEu1I9i7y1VToOfev99JkAXWeQUCzQSWUy8WGCWIKo2LgcT/SW/8gEYWXPekXVYT5/yPNxb+ZUJv7g+8U9/3zGr//bX3Ym1AEflYXX5QspExVdf0TLUnTTdHWOej5gom2XL5ifgGGGZp9qQ8I+Jx8098yMK5DQTUKPI+VJmboYDvW6e8HhWIbsxxKDRxQFIlDbL905JY+JAOHaVF+mgP8Ertmg3qKLsraluP8IrhIh+1K3D3LV1YWS0qe8Sr4YLjcqittLCsAEla4STON1CyaQJJ8m+3aAQr5AoWL65/g9M7sykRQ7S5JR5NRaFPOr1+tft+aB/FynhypxxBjFCWKcZViFRr81kGBb1nF4jVaDXATQIPdcGU7wsFAU1at4xoUewoCZFbBicR/9XvG3d02hfobOjQshpyjolQ3Z/zhUZfjlZ2q+EmRSDo6DzmUnHNpLIaOtNULhcbKxFvuFauBjwbKxZqiCQDcTmSA/nkjgOaYIq6Phkm8E4zJjbmRry9e1k6XshV5tjUdzyIH/teOGLFyOcqtuRcdRlvXy7Ky6JuOfc24rj59GRYjadfq5WrAsibR6AecJROctB/jFriZ5X4vk2Di3f7On5JrIVKj+Hvtqm77yU+zlE50TfZcGUVM/XCneaZm+8pLuGlz9TldGmYTMWyeyQF4cdQ0nH8R49sU7Md4gfyUJSIaFitPsRebZsRrfFfi2DDw2+CEM8axcXwTbksC8L8J7cFLS+yUHH8xWxVueG85zs3cFXosKH1WFJzwXaL7SLsHLAcvn5ce0WaJOjvYDDtu61k66S4p9F+/Vu7oWHy7aduXrETXWQmFp2eFQvVKW6EQPjOdtdg=";
		
		String orgData = "c1/zNBP8nNQi0M6NRrwrKlF3k8dzwjp3b2H9XFF90dAlJx4EheDN8cDmMiY1F1Eb/XJluVaFST2+DMFGH5E2MvoTgULxsZ7+TrU8VROIXHwyJDvFiW8+HtNTfyBoXfHh8pc+zljxwdkI4rynWwWNbAXBdgV3kjtLH692HFSVDfXdncuL9JBho9pMIIp4z/sUvlwLPIexfwZbdxF1AEJRh30+G0rWqdU03MhE2yZrlKVexBmBNIccYJ5PTiDtvtE8cuBEhI/SJgeHr9mOJkMpJ/+lk/ol1iS31VliWJJvU0qASfNDaRdPOPnC8aUXwkKkgN7fHHtHQt9/JaNsvnFnCFL+pU5ZkhMXkhNLoRCKVL1azILTWjT/qv4WV3SVlm2QhrWkYwvawZXemRUsyDVgikH117Fqdv+WbbObDOsPA+JdIsU4Z4moh2daS+VV8EP1AQDJ/+VOX/Ae7pnC50bS7cQSg0Rc41RBXujm85GCcxWWiGZBOFklaqNGKf2PtOir382hHrHgdyG19S2Nn40Yzql6+ss6MSltfpppg2xb5icL0J3Imo7e9acGz1aPrNtxbF1hz/Fm0nQVOBZKoJhng9CXcZCBv/KzxBjV4cVfmHNpjECgIQ86ijB+EDgv0fiMsxWFdyMRAVTbbVgooFczHBRFevyWf92TGHy/KpuqddGre+ltAE8gliqy7Tcj8wRJzvdT9NDlBMj/P5SBe4HJA+Mo+rnDrk/5vBTiFxjAexnPFtAtoOssAihfAH6MvOMq3Z2/NE0nj/dypmgX6sW2L4CcFxUro5/lfDikw6pvAAQZRaJ+8JOvrjIjDW0RuPeToWxPRBSaqO7Uq1D8Tf9ADiZFBoHTWBWIRclwolcqVI6ubhH76cMJGOC+tLFq0dsJtKTxfIwZRVXNG603pK/lZLDdcdodqwYDrLwS1tunknH2F1NllgcOnWWwrxr8LSKkMjR38TLuE6mro4P9k9EfIdpOZ8W7w7/+1HC3rIMSUxP8tys63+CmKnAYvWxkeNBNcXNOJVffqKZisGQHA3FGVvtSbJ9cBouknkHnvuc+Mx7usKfixKYek+7+bnbAfM1zzXncTryRpmRTIFPECwBUKmlIztSv9n+fkw7ig19UmWu6e0NSTJEKSZApm1hLcUIwIbaji5QHDB0tcQo5Lqzyq++P1Rm5lcYiZ4wwRrdXl2DRagnn7xd9j/hfG9p9Hh91+89cwshq/qToTFI0RL+NHaWN4zLS5pczg+y6eNXzdERURUdQ0KQki3/a9oTetUNUPQj5IcJSojeAlffRHjmBNWlWes/I8IneByH3QSBGJZd6Hqa1ohOj0Zq3VxBtOqExuTzuXJHGnrou9EArxRr7gGUQIfjowINOVWT4KYjgY73FPYZOjeUqUie8kCYMVhAws8AkdjDudddwvqFjJoMrzDIfxf4pv0VTByPhZF0M12gK2JTt4+RCk/WaILkGaIc1Ed+ByVd+Stt0topcLgTm96sEP1miYR738w21BBWb9YMyoj6ZGczCt8himgdoZ7N9g1Y+YyOYw0u13vUzXEfTq3TquSTlfSipD1qTbIOarkH+SD+0jkmda2a/HdsZ75f+TMbzp9g7n2M65FJ4TvuPQYNtP1zwc0dWhWUNzqYwTwhn3774PMwJ/ojBHTm6PAEsREOPmynKdoD8+Y3Rxv+8J5d3WbrOwZsw/lJqa2fqAoPvAO2agSEMVPm29iyIP4YCV8+sMcLbKiTnUixm1uiWFzpfRHD3XrjwzSS1lVtDwkPVDyhS5WDpG/VRndh37jBfPhDnQ06f4YzhnPuUnrbpgk+Tk5FUUrT9H3wr6ZSHGEuJH56dLwGpA/2OheMzPUMmWqjbwTjhi8ti8eEU45jJNnCdJACyE8lKg2flkg+tTqgY7VvmqvGw86r0ypIRWgWMHBgz3ZEETQoHeaLEmCzRz7NzGbIKiv4MJQncafDKyEGuUmy7bVAkZbaZvevNDUjoLqQ1dcZGTXz3G7b9t89DagrW1jHPukwPbC45D+atpK0xPsAIps9WCkACraLZFgLhsgSPrmoiN2QcYzYNBU8iGhLwnQmfePaofQQ3deDjXU5QgALC+bbBJUCDUx4QX6bnSpBCKmZTKs3OtZyADD4Idipr3rXBTbCupT/DNdjzEP1rZFfXr24TkzRPXeOgc9rTHlniLGOpjr5kBThv4syF7xCPZNk/gJeRatVxhGK2qECAc9sJxftQ88RjY90Kx3fg5Ryk+YqOgNkex9htZ7w+0y7WiABdRQHL5qxtRgRbWxol8Ex0/QCJBklw8TjWhEAJkklyjCyzoOflXcLwQPhiygvpnL/uf0aPPx8QcqlRYpN01UmxzkoZwDlqGfjHSvqhcD1ZFL1xQiA3U0bRKpoyOaMrr/YesMpOBJcjEUjD2H+GHr5VevLhTWHe3N0UXecJfqklubt2+HD6elXubK11HLHrysZ4DKGZl6UxAdDHU8LDH2CjLSJzVMd1F2hyLh8AuV2FGsWytwQOvSPmM19ea24uCQcV4+QsGLblrGHMUcKaNnfsHv4494/ufRbngu9js3oiC/XCwnu3uTQCq8RWUjXu+fli/Cu508yOu0n7mv92RoDB6viXOdJ9nzBbujYUwP4TXXHANtyU1XMox7F0P4wF2ZpCnOaEo8Orqp9vyvuCc+t7cM+l6Mkclez0xEaStih3Hx/tUCYGF17dJZCu2z2c5akgKslXMW1fgEvOCbXR5EEuYStWKLxLn+Kxn655r93MU9ldJGR9EUQkCwZxF1dQTAwTUCoPLnXKiHOORf2Bh9kNsaEPrh3vep5tQusufriJUVFpshosEvp4Dq8u3g2p4iMhiaFaU34K2kWVBFTCpdyTH9bqYgx9ik5/QgA7JskHWhZkCVvqBKqljutw+ExDgDWhn5xiluFzaLWGpxHpBsyunVV3s5tZeMIVGHmbJaKjVpev7s8LTBpEdLHe8+pCEwCWtcR3w2VjDePHZW6QZ4lwX8YyHNh7NzJ0K7NhOUO0EcHS/y3b7Qw2UGKtLcr4qU5CkdZxPideriHMX3sJ5h78FAlZR2+FwGppSNmYylBDDg3iX6CouU1twQlZNRSk896ZrZ3cOIFLXNMV/oewOjVIsa2KQL2FKYB/q+56zOKPUmEpSxsVKP7LsSQDRiHItt4TfXo60FmVa5Up/7anSe00kxon16URGvHOMbk7WXa2tq3hWpfli7kezB9tDvqwnVEk9Jj6EKiYLhj9i8QVaKZK7IftzGVd3HkCGHBfARFEAAp64l55ts+TKnklfyMssXFMTShCOmlHxrtb6lcaFaAhlSnMBZ1/eX7pRChEQftc0Ip7fZOChY5Zo1mDiphTiv98kZB8wLKkQjwUBP1OVJS99eXKDmaKZsieSz0akMoBE5q27XmvRs+8x1xZZBGXPnlRCrkGCYI8SUTDpnRos5gv398jOH0gUudLJFvgNl/yq5tAgew+VRrI7yAHOv34m9p6/JPmsNV3uzfUOmu+JZecZ19K3o7vQ2ZPbXXlZsV843ZG1zDcgNC8K5W2ASG5Yny7v9IwUuXJijDhMVbJwDsoMP8yyrjh313XsJkRT+n8jKtELvWWrYeN9c8iOwFQziQuR0NEMXU8f4aJp1dMs7kleiYvq70MlbA4G8rw9XuKymjfFmGrzLjJUiD41ym4LYjkfU0tTiZP4A/TvLu4QwJ+dDM/KDll2BgI9WdnR0mtlYW1lPHBlyacrFdsGw56LRtSQ1o9fqHP1mV4/xwb1GH20hw3GCie/7tsJCroIt9yBGTiX+e3WhvM5kLLkimuvn06/M68fwiCitBIb5jUwzPBnekWjOGhfLR90fnzZsWGAlzC7fA0i9JaHw+lBVWGp9GVYwGZ1xmf9qleQpVSWQvFK0jVg+XQ6248tE7OEdpseDyQ+1b1DjZQpB7Z/hHxrqAsXmDak5k3WTK6lS/sk04kJioeEIT6dl+E4oBZTOHJKnxZxFpCoU2bHYOultWSJDgNP0c62VotazMC1bQitrTNPMl7d4oN2Ey5zQLfTEudeFU6gu4u48p5qR930S6l8h8HIciWJ9y/u45pKBUgUucMw7yyRvXqyBbNsAFhTRoOMxNjJjFhcm9+2/ry//nPPKJHSMOYO7XRa4lk4uYJKI5kwmAy2Dq6sotQrMjQ7nN+ewlYPwPFJYvXzGGg2Q3MMOqy2rZsr+kpGXWdrfO64xYbF+aZcOg3Tszw2gUt4txcPqTE019/OxUegT60xKU3ZM61rAVviF+1nuk8IAqOgiIcKuSPFeD1EERmpVX/kOLNf3W8DRVp1/SAoTKw1qv6s6+ONQYCZVmnZ4ZOo9aNvvj1wFO6cpPZqU4D7YUR8afc3E7vboRfux9meMg+Tczz3lQ8KdS8kLvu0lvq7yPObj3a2nXMro0PtQpl/k5pITwknvJOJZlYUiu7MTDH0/YqOlP2igeF6a+JY0VodaVjxrpuKUO/ygET2sJoICiCXFAwjsFGna3wmVP79v0e7r8aibQAY5eLSiFEt86xQy86EE9gz+2vsMo6qcrQ75KmhLgEA0drrn/1V8QrKKPkyGj0UrBXY3eQoXjq3MxTZh1N2pwMphwcM9dJC/jQMWrRqfBG7qaJav70BzU39uNOxMh/YHtzoZFYcqT3nWN+aTL2QuCfnMF61K5vtdB1/fqmUG+A+Nx+6n5oUcNgFYoh9325wiD3keAcqyAcrZVMCfI8OfWPdRYy59SinvYg3geRs+cXbBSJV4OEqPhCBggJ0H2UdU7ca5wP7AC//kZpUvTFqApVxvzIudp7q2ZNeRIRSB92TW9ZJ1hA44d+6lLcE2Y0K/FSJVWsDp4Ytcw5919mce2qiVMXLcdXhMtTTzAuGej7L7xIeS+ss4J32VquXhgiRj42ToIziG6xt0jsWjmlFKN9LqS4Zj5q9ykHBmjv8iO7LukjD6d7x7ck3lzKZphUDxSMtFgIRLSKeTHUCIGc/zhots9Un43lEKeYJ/8Ansn1f4mC/401cv4BlUoqv8DG+v634EQh7IPi4sQH6GfQ8edVnZJVu3Jw3shjv2cO1B+t8hGufUY0sB9TSvNqTJWchBB1BTKQ9EZzSEBIAE0h/DB3nySCvQozi27VKMsVsZveAipgR75H3AsXtpYdlcF1dfJgkhXAdHsUdHvZpIsN4iGjfyMLWnHpyr/EA5vRvarjFlEBpHDJiyg2F3SbU6UHe1PznotuZlQtuS+IVH2jjDhItY5o6Xc+QAV8Dui+EJWr4guwxfScC+VA1idsoGQX7g5ol/nLNx3PwmVOxjZpHdRakjIlC3ZRnc31xzEZxQq85J/l5Vsen8sYz0nT9F4hshflUGflWg6e61/gArPsDSufXCiOzFvZdxk6J0HPFex2/eGFX+5EMEzpjJQEnUk/IPPF/7TTniJOsg6irWhLaJuFweERv79qVkCjafMNVPp0+Sg6p8xiFkSs3b8HNe8WwubONp+or8E9p/krW2bCcPkpFUWI3r1t9Bhe2aL/ETmf4YcQLbu8rMxMb1M/oGvoTpzBWdUfRweALyPMwMHcS2aMCT4rsfdannJXs+LAhiyDbFoqNN9t8AdY3QYej2Xu5USGRjdKngXIVKQvZwbH3hLMI19ymeotVkrQRY3mtnl5lxqdna1l3Ca5e/B33a46btet7GJDQ4Z9hk3Mc5xWZX6w7qJ29hpB8dv6bAxkmrfiVYP58aFDe3nlINNWqYht0UeNY6jeTFwlvDfDIB3OO34dxcfrteFM1eJUzl8MzxGU2tmHi/FIdOwkyMDJZ3yeegLvJwR4rafVu0EcruRy6iZEa3NQ/G5PoLVqZSrpQi4tU5q5qcsV7g1XtWFi55YfaR+qpieI9rZt5/HM++w0z5jnHjxedx/0LDb+zTQ0c18dJe6kkGGV4bNMqPFxxFYDcPy/nu/UtzrYShOimGfCgExiolA+Y8wkhgG30lmrluJWJvvfzgxZoduTi7ceGrIvgXML5923SB/kG89iXvqxm+2qTXGU2jT0ShTOyPWc+BezHTkd78BTEdV72Dg3M5N8Q9aqCJ7fwVzCCdmbOGMT1NyZcUwtASatimnWoEm2yGGOdgyf2QxiLrjMa65JjCpp3vwyGrd0fxbpviFC6mtDRE5e4/hhn3UnWAGB5BSxCnHZVECpeucn39hoBnJ/9P8gZbXbufSxHduuJjZ4RDAFHiZzkN5YI1nVO3Qirh8gGnDlPaGwx5fx8J3aFsp/5Fo+domrgjFTWlEa/g2QKHyuB/8qZFx13fJPhPsWPn9Xu4fU4vtxQmoKAwa7mvL65R3zFqCCbpFTZ41vZABuzZYBPn27UXHJMn/yrOSSqHTg7/pMBmu65XkDCxenxLeYFmlv0Rx7Lrr+LE6hVrHGKt1CyvEnmQKbHp+JY1eg+R8FJX1NB9QcrvKwFY4TLJelpGnIsVtu0qxorXWslLR06AKM+i1Mw3PayEkQC4JvqoHCrXXVl/4J2QcinrfqWph0BjKvEYqbKrgzFoJfUro/fJKPJPRbcN0CwJMxl3f4WmTsQuAf88zwpghE39n+M0QfxlVrlavqURrVZ1jNReQnQlHwlmWb8pHVqPpCbmuzvJFpvI3wVuNxVTWR1FVi+s4qpV+Oz2X4RBLnBUKNwxxYuWHgo5+P0xeQQCdG6uJZmrCdgXKSwPmcqOud893hFrif/cigPvYJbjntefOY5miHKbFq1fESXUkgmMwuq97gu6X0UnHYgzDxzsj0kqQfqEQjQr01jkH98VpItQ7J02/fowhDDu69VVElDDhTvhBkOPRInnqSbCxuDAByQRIR7sqyDzurNV7Ppc9/4wwD+C95Q3HcVZDlS/E2YJ1zllcKa1PQ+SfYqEDh9Xnf5knjhQg84VJZRj/Pf/Alj12+PAcmQqkK6WMuQs/yz+p3odmHfOcnmIQ4MQ2o2B1k401CKYXGqU+1m88g7EUIhn8iYFfNFrSLMhaxHEn2JsKn+e7WnODT6jN1BLTdPCB9PUNZPQeVD4l0g/fuoekTvWYJilFGYk/A7NPaVn3R+LfQzEW74S4yq99+/42hDNwMkyLFYFii5RwxvxPTWIMz3J3rIUwi2aMvwlOWMHz7pufcLxI27nUwKdg4yaz4Kqu5aIXx7hDrw+M6nM8OIYBTQZVzKJ72Y3h5AgAGyFkLCsOBdHEZt9O8yhDou2T2VdqZ/YaCqTXatO3yQj9xAZsUEjm23K8R5YbANLM1NumpsqMOSKBjpVfN11rVyprI/rhNaoIREWeD2kwamg3Zw8GOcjgfSaQwNXVRXdhFbnXqR0t1WN5h7kRV872V5BH9x/1X4W3/LahSAOOphZ4qHfNBo+ZH0ryBn93A/UL9sIpm0IGz9gDKQGAUju5gsw6HvvEn5EBaXeWuZ1qI5JpIm+l17rzah06t0poaEx9NkiC2UizVoOY9akksQV1sIiijA6hrwolT2xuWfT35sUAvqd0SnliaGjbNe1VCBoK+NST5bYohvGXgBUW3KlkeDmW9qT4PMF8nFKqS/px01QWFpvXLFVN9sc7d99rNvWQK6AS1PU8Gf8Xp9EtZ+BbgMAYKcHmhKfGftPylhfpWiB5oX/tkmM4OR7dCofZnTNyUYy9R+OwXPhu8Z67ZJxDzirOiwdacUw7A+Kf9HClt2OZUpdiU4YzsNXI/clPzh07ncKZhB3m/coNHeN/2e6hhg6uagUINxv31N2anPdhigrHZ6Qq9srb+UrTSQ5+dszh/w0xNb7SNQ9NB34b4VjQwooP1MnVgR3tZPH15ZSfPk9mDLv4J5s52Le5ApuJK7gzSWAXlsuXYvyG8Ic6i4DWYite8DpBLre+BFg3yGilau22MFVoQeXBlr2HxchmGDmDpG8MuZkI6S1EFmHBge8pQobPQBeRbcMVpAsvWJ1h6jS/xgRSFZiqkUszKzSKyBYANZk4AUhY8M2cBy2aL3nIVslCLbuA9c/AAPblaCpzZd5GZ8ZVTBWqRTL2r44p5QQTdQvzUOWtiE3FCcb3Pl5gNLmjzdzNC2PqRPdOsBbRZoI0MuABcPFpePsbkm7eU0Yo8k5D+MexRBD58Kt2Fdgu0GI62N2IUlm6GTD/BXZCxUQByGBujZ3iCZSrQSihJFNV4OoYEy69y/+RG/sG/LMhEpxH3A5dC5l6WXJMaxlrUwx3r2yBAdocawQniTfovVw+iPuRAMLcn8CvOl2jgf//HGIFeoVC/anaONlJes14Hjw6hQXIgWGp7HwbkEQs=";

		String apiKey = "0c62599e-d2f3-4ac1-9839-39ad909d94a8";
		String apiUtlinsttCode = "1741000000000013";
		
		// 복호화 할때 ( endData , apiKey, apiUtlinsttCode )
		String decData = CipherUtil.decryptAria(orgData, apiKey, apiUtlinsttCode);
		System.out.println("decData = " + decData);

		System.out.println("테스트 끝");

	}

}
