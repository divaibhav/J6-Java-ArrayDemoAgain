/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/27/2024
 * Time: 7:37 PM
 */

public class ArrayProcessing {
    public static void main(String[] args) {


        // declare and initialize
        // process -> print, sum of elements, even odd check
        // print suing Arrays class
        int[] array = new int[5];
        int[] brr = {10, 20, 30};
        int[] crr = {785, 6281, 297, 530, 5691, 2847, 1511, 7952, 3857, 8550, 8798, 4, 3989, 5523, 8066, 6192, 5425, 4939, 9024, 4686, 8900, 1670, 9527, 9331, 555, 7070, 4699, 722, 3417, 770, 6725, 8234, 9245, 5194, 1626, 6712, 2212, 5081, 7789, 8612, 4331, 2987, 5603, 5447, 4770, 9149, 7066, 6831, 7007, 3483, 4822, 6055, 4079, 2134, 7921, 7896, 4343, 7926, 4934, 1491, 6111, 7188, 7813, 2079, 7391, 6306, 4407, 3893, 1448, 9555, 5107, 3610, 1549, 5919, 6578, 1085, 9942, 2499, 2327, 9108, 4500, 231, 148, 7639, 6187, 9732, 661, 6139, 8340, 4599, 3418, 2146, 7741, 9480, 1608, 3363, 3323, 8779, 8928, 5837, 7930, 2974, 940, 2087, 2362, 305, 8645, 8351, 1085, 33, 594, 8769, 4456, 6233, 6678, 3281, 4777, 4584, 7942, 7522, 2588, 4335, 4298, 5991, 6703, 3216, 9082, 1818, 6279, 6530, 8890, 8472, 460, 1193, 8891, 997, 1927, 3206, 5940, 3511, 6948, 3156, 7424, 5019, 9681, 9013, 1042, 5056, 7536, 7580, 9351, 1791, 5740, 4150, 6610, 7281, 8110, 8356, 9112, 886, 6400, 6408, 6920, 5456, 8177, 3487, 5364, 8229, 6630, 3702, 6614, 269, 7162, 2431, 2730, 3356, 527, 2827, 583, 662, 8142, 9791, 9384, 9659, 7214, 8734, 5139, 4285, 7611, 8695, 404, 7018, 2448, 4724, 5535, 5735, 7823, 9622, 1544, 368, 8339, 7558, 2145, 2709, 6332, 3606, 1842, 761, 4488, 882, 5504, 7899, 7882, 9798, 3956, 8253, 9507, 8090, 979, 7284, 9639, 9660, 9749, 8084, 4072, 8741, 4353, 1207, 9352, 21, 4579, 5739, 6008, 3572, 945, 3536, 8219, 343, 9651, 410, 1865, 3949, 6614, 3369, 5991, 6055, 5961, 8606, 893, 2568, 4743, 9127, 9840, 7473, 2281, 4325, 6256, 6024, 2760, 7953, 3809, 8170, 4078, 4204, 8097, 4576, 3972, 1625, 5063, 3349, 3953, 7227, 7622, 4034, 2044, 9329, 8939, 7746, 8666, 253, 5119, 5539, 7886, 3890, 7753, 4008, 5444, 8929, 408, 9752, 7741, 9171, 69, 369, 9942, 1731, 7106, 2787, 8316, 1199, 7997, 3614, 6606, 8151, 9268, 3935, 81, 7370, 7444, 7530, 812, 4703, 7819, 9242, 4591, 8079, 7341, 1429, 9664, 3248, 2376, 7712, 8749, 6405, 7002, 2962, 8619, 2197, 5420, 2402, 4367, 7096, 4755, 7810, 7576, 3809, 5731, 1347, 9454, 1325, 7161, 5349, 2133, 6014, 4607, 7751, 9113, 3625, 9353, 1521, 5958, 7441, 5530, 2516, 1479, 8249, 9761, 1661, 8618, 6654, 1683, 9703, 8863, 8054, 7406, 1469, 7865, 1239, 1680, 7785, 6743, 3318, 6030, 6288, 1672, 3416, 7523, 7859, 1590, 6068, 8386, 7890, 7007, 1539, 7597, 9668, 7030, 6841, 5724, 3616, 2339, 828, 4818, 8331, 8871, 3419, 1037, 2804, 4238, 4278, 6027, 1551, 3333, 3241, 2138, 8429, 1764, 9439, 518, 1275, 2483, 5041, 8085, 7098, 4167, 4580, 5726, 6929, 4211, 8148, 5576, 2063, 840, 2224, 3328, 8884, 7975, 3637, 3038, 2159, 6024, 2410, 7437, 1263, 1635, 9273, 4050, 3157, 6395, 6941, 620, 4213, 5987, 6786, 4728, 2168, 7934, 4673, 2153, 4117, 8820, 568, 5129, 3798, 3345, 9655, 6408, 2120, 1808, 9495, 5937, 4185, 3189, 4109, 7192, 6096, 8209, 8149, 9018, 6550, 6811, 3217, 1878, 6219, 9985, 8457, 7368, 7613, 3279, 3981, 9159, 6290, 1322, 2550, 7020, 2836, 4425, 289, 7750, 6477, 548, 6143, 9253, 4127, 9081, 1814, 7478, 8182, 6147, 5399, 5220, 5817, 1508, 9331, 751, 8985, 8644, 2875, 7433, 5258, 1088, 437, 400, 1623, 984, 5958, 2581, 9033, 5923, 1188, 6920, 9707, 7586, 5862, 4381, 9946, 5530, 317, 7534, 4286, 9599, 95, 9790, 1049, 300, 7047, 7931, 206, 2617, 7154, 5384, 8477, 3402, 1730, 3097, 9482, 1019, 2631, 479, 9749, 8647, 3136, 9751, 1723, 416, 3040, 4832, 5946, 5780, 6277, 2632, 3395, 3402, 2723, 5078, 2022, 1187, 8886, 9037, 6369, 7663, 8119, 5251, 7165, 7420, 7612, 7686, 1625, 9162, 1405, 9716, 1716, 6709, 35, 5809, 7822, 852, 5221, 7362, 2749, 7116, 1155, 8255, 4599, 3763, 1229, 1242, 6085, 9225, 6290, 3819, 3747, 4040, 1584, 4149, 620, 7471, 7632, 419, 2011, 3438, 4696, 9400, 2267, 1637, 8406, 9552, 1550, 8557, 5280, 7432, 7190, 5568, 8929, 7110, 7201, 9299, 1782, 4422, 6905, 1852, 406, 9982, 6222, 8535, 6839, 1240, 7484, 2, 9274, 1824, 4478, 1272, 1288, 2859, 8133, 4387, 5160, 5466, 6920, 3324, 6583, 6063, 7553, 3976, 5160, 7663, 9038, 7382, 7200, 3350, 7976, 956, 7813, 7195, 7083, 9880, 8177, 2694, 436, 8608, 7360, 8138, 6388, 8531, 7661, 6446, 998, 8711, 190, 5814, 6035, 3315, 5534, 8938, 7076, 7388, 1336, 3934, 1208, 5001, 7438, 505, 5404, 1933, 7291, 5634, 314, 1554, 5289, 5085, 9517, 517, 1189, 2832, 690, 5601, 6554, 1122, 2693, 8748, 4579, 4453, 7649, 3658, 8180, 7407, 6527, 4989, 58, 5227, 5243, 7602, 7733, 5385, 1783, 8961, 4688, 7363, 6355, 7442, 3852, 6365, 724, 5756, 8189, 7364, 8137, 5457, 6717, 2881, 841, 8480, 3145, 5920, 5876, 6233, 536, 6480, 5056, 4098, 2342, 2375, 1952, 9277, 1475, 9677, 5106, 5679, 9339, 7023, 5271, 9086, 6592, 4197, 9556, 1953, 5894, 3114, 1091, 4599, 8316, 8116, 2053, 5418, 2569, 5843, 5090, 9828, 9230, 1055, 5882, 2283, 9436, 4994, 7952, 3013, 8071, 5095, 7757, 2094, 5995, 9510, 1227, 6859, 7693, 8703, 6167, 9745, 6678, 8366, 5384, 9671, 3197, 8344, 811, 7220, 5972, 8202, 4976, 9900, 4354, 8058, 6575, 5727, 7830, 7342, 5460, 1788, 5038, 4133, 4716, 8969, 4053, 9125, 9618, 2710, 3436, 6814, 2298, 2220, 5065, 7990, 7944, 3758, 7133, 3516, 3820, 4630, 9398, 7581, 9682, 8194, 3643, 8404, 3665, 3115, 2443, 5189, 2422, 1312, 5588, 9830, 4491, 1115, 3886, 5142, 3433, 534, 9921, 6283, 8739, 9723, 2542, 828, 6729, 1535, 609, 4207, 3728, 5768, 6325, 4603, 793, 905, 6772, 9611, 7617, 9431, 8264, 2868, 5338, 958, 5186, 2674, 9787, 1816, 5219, 8338, 9093, 2847, 126, 223, 917, 788, 5962, 2431, 4831, 6191, 2651, 7633, 5142, 6744, 6172, 3194, 3329, 9839, 7824, 7724, 5295, 2132, 4412, 2926, 8257, 5822, 5193, 5951, 2477, 6670, 9438, 279, 5195, 5080, 5447, 7139, 2391, 6843, 2944, 6535, 560, 2608, 546, 4126, 9500, 3109, 8746, 7359, 2463, 2145, 7863, 1429, 5438, 1962, 7658, 701, 4956, 1728, 219, 6154, 4634, 3894, 1856, 6147, 3403, 3021, 1326, 1990, 9598, 447, 6675, 5033, 1709, 2818, 8929, 2192, 9595, 6557, 4271, 3448, 7953, 2519, 5181, 3941, 5815, 4560, 5771, 928, 5206, 7117, 5156, 1827, 1213, 8704, 8928, 3001, 5898, 1040, 459, 7479, 2410, 6737, 829, 9344, 5285, 3468, 9515, 5030, 4019, 4056, 5110};
        // arrayName[index]
        crr[0] = 40;
        System.out.println(crr[2]);
        System.out.println(crr[3]);
        crr[0] += 20;
        crr[1] = crr[1] + 20;
        crr[2] += 20;
        crr[3] += 30;
        System.out.println(crr[0] + ", " + crr[1] + ", " + crr[2] + ", " + crr[3]);
        /*for(int index = 0; index < crr.length ; index++){
            System.out.println(crr[index]);
        }*/
        //array  -> length
        // arrayName.length
        System.out.println("crr.length = " + crr.length);
        // process the array crr, to print only even numbers
        int countEven = 0;
        int countPrint = 0;
        for (int index = 0; index < crr.length; index++) {
            if (crr[index] % 2 == 0) {

                countEven++;
            } else {
                if (countPrint == 5) {
                    System.out.println(crr[index]);
                    // only 5 print
                    countPrint = 0;

                }
                countPrint++;
            }
        }
        // only print the 5th odd element every time, but count all the even elements
        // count the even, print the odd elements
        System.out.println("countEven = " + countEven);


    }


}